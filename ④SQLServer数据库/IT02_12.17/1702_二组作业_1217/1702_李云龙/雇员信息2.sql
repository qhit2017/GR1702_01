USE [db_employee]
GO
/****** Object:  Table [dbo].[db_employee]    Script Date: 12/17/2017 19:32:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[db_employee](
	[id] [int] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[register] [date] NULL,
	[recommend] [bit] NULL,
	[department] [nvarchar](1) NULL,
	[remark] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__db_employ__salar__014935CB]    Script Date: 12/17/2017 19:32:29 ******/
ALTER TABLE [dbo].[db_employee] ADD  DEFAULT ((5000)) FOR [salary]
GO

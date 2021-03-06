USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_work]    Script Date: 12/17/2017 19:21:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_work](
	[id] [int] NOT NULL,
	[name] [nvarchar](16) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[department] [nvarchar](8) NOT NULL,
	[recommend] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_work__salary__014935CB]    Script Date: 12/17/2017 19:21:48 ******/
ALTER TABLE [dbo].[tb_work] ADD  DEFAULT ((5000)) FOR [salary]
GO

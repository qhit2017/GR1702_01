USE [db_employee]
GO
/****** Object:  Table [dbo].[Table_Employee1]    Script Date: 12/17/2017 19:32:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_Employee1](
	[id] [tinyint] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remarks] [ntext] NOT NULL,
	[recommend] [bit] NOT NULL,
 CONSTRAINT [PK_Table_Employee1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
